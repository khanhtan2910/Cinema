
let host = "http://localhost:8080/rest/cinemas";
const app = angular.module("app", []);
function formatDate(date) {
	return [
		padTo2Digits(date.getDate()),
		padTo2Digits(date.getMonth() + 1),
		date.getFullYear(),
	].join('/');
}

function padTo2Digits(num) {
	return num.toString().padStart(2, '0');
}

function compareDates(d1, d2) {
	var parts = d1.split('/');
	var d1 = Number(parts[2]) + Number(parts[1]) + Number(parts[0]);
	parts = d2.split('/');
	var d2 = Number(parts[2]) + Number(parts[1]) + Number(parts[0]);
	return d1 === d2;
}
function compareDatesTall(d1, d2) {
	var parts = d1.split('/');
	var d1 = Number(parts[2]) + Number(parts[1]) + Number(parts[0]);
	parts = d2.split('/');
	var d2 = Number(parts[2]) + Number(parts[1]) + Number(parts[0]);
	return d1 >= d2;
}
function compareDatesShort(d1, d2) {
	var parts = d1.split('/');
	var d1 = Number(parts[2]) + Number(parts[1]) + Number(parts[0]);
	parts = d2.split('/');
	var d2 = Number(parts[2]) + Number(parts[1]) + Number(parts[0]);
	return d1 <= d2;
}
app.controller("ctrl", function($scope, $http) {
	$scope.cinemas = [];
	$scope.movies = [];
	$scope.shows = [];
	$scope.Address = "Hồ Chí Minh";
	$scope.cinema = $scope.cinemas[0];

	$scope.searchAddress = function(address) {
		var url = `${host}`;
		$http.get(url).then(resp => {

			items = resp.data;
			
			console.log("Success", resp);
		}).catch(error => {
			console.log("Error", error)
		});

	};
	$scope.changeCinema = function(company) {
		$scope.searchAddress($scope.Address);
		setTimeout(() => {
			if (company.trim() != 'all') {
				var url = `${host}/company/${company}`;
				var items = [];
				$http.get(url).then(resp => {
					items = resp.data;
					var temp = [];
					for (let i of items) {
						for (let j of $scope.cinemas) {
							if (j.cinemaid == i.cinemaid) {
								temp.push(i);
							}
						}
					}
					$scope.cinemas = temp;
					$scope.cinema = $scope.cinemas[0];
					console.log("Success", resp);
				}).catch(error => {
					console.log("Error", error)
				});

			}
			$scope.cinema = $scope.cinemas[0];
		}, 200);
		$scope.loadMovieWithDay('ngaychieu1');
	};
	$scope.loadMovieWithDay = function(id) {
		$scope.shows = [];
		var nowDay = new Date();
		let dayShowMovie = nowDay.toLocaleDateString("vi-VN");
		if (id != 'ngaychieu1') {
			dayShowMovie = document.getElementById(id).innerHTML;
		}

		var url = `http://localhost:8080/rest/cinema/rooms/${$scope.cinema.cinemaid}`;
		$http.get(url).then(resp => {
			var rooms = resp.data;
			for (var i of rooms) {
				var url = `http://localhost:8080/rest/shows/withRoom/${i.roomid}`;
				$http.get(url).then(resp => {
					var showWithRoom = resp.data;

					for (let i of showWithRoom) {
						let dayShow = formatDate(new Date(i.date));
						if (compareDates(dayShow, dayShowMovie)) {
							$scope.shows.push(i);
						}
					}

				}).catch(error => {
					console.log("Error", error)
				});
			}

		}).catch(error => {
			console.log("Error", error)
		});


		console.log("day", dayShowMovie)
		console.log("shows", $scope.shows)
	}
	$scope.showImage = function(id, name) {
		var linkSrc = 'image/' + id + '_' + name + '.jpg';
		document.getElementById(id).src = linkSrc.src;
		console.log("day", linkSrc)
	}
	$scope.changeMovieShowWithName = function(name) {

		for (let i of $scope.cinemas) {
			console.log("name", name)
			if (i.name.includes(name)) {
				$scope.cinema = i;
				console.log("cinema", $scope.cinema)
			}
		}
		$scope.loadMovieWithDay('ngaychieu1');
	}
	$scope.setBgColor = function(index, id) {

		for (let count = 1; count < 8; count++) {
			document.getElementById("ngaychieu" + count).style.backgroundColor = "#EEEEEE";
			document.getElementById("ngaychieu" + count).style.color = "black";
			document.getElementById("ngauchieuduoi" + count).style.color = "black";
			document.getElementById("ngaychieungoai" + count).style.borderColor = "#C0C0C0";
		}
		document.getElementById("ngaychieu" + index).style.backgroundColor = "#FF0099";
		document.getElementById("ngaychieu" + index).style.color = "white";
		document.getElementById("ngauchieuduoi" + index).style.color = "#FF0099";
		document.getElementById("ngaychieungoai" + index).style.borderColor = "#FF0099";
		$scope.loadMovieWithDay(id);
	}
	$scope.showFilm = function() {

		var url = `http://localhost:8080/rest/shows`;
		$http.get(url).then(resp => {
			var temp = resp.data;
			var day = new Date();
			let nowDay = day.toLocaleDateString("vi-VN");
			for (let i of temp) {
				if (compareDatesTall(formatDate(new Date(i.date)), nowDay) || compareDatesShort(formatDate(new Date(i.date)), nowDay + 7)) {
					var index = 0;
					for(let j of $scope.movies){
						if(Number(j.movieid) === Number(i.movie.movieid)){
							index++;
						}
					}
					if(index<=0){
						$scope.movies.push(i.movie);
					}
				}
			}
			console.log("movies", $scope.movies)
			
		}).catch(error => {
			console.log("Error", error)
		});
	}
	$scope.searchAddress('');
	setTimeout(() => {
		$scope.setBgColor(1, 'ngaychieu1');
	}, 200);
	$scope.showFilm();
});


