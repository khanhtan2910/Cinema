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
	$scope.movies = [];
	
	$scope.showFilm = function() {

		var url = `http://localhost:8080/rest/shows`;
		$http.get(url).then(resp => {
			var temp = resp.data;
			var day = new Date();
			let nowDay = day.toLocaleDateString("vi-VN");
			for (let i of temp) {
				if (compareDatesTall(formatDate(new Date(i.date)), nowDay) || compareDatesShort(formatDate(new Date(i.date)), nowDay + 7)) {
					var index = 0;
					for (let j of $scope.movies) {
						if (Number(j.movieid) === Number(i.movie.movieid)) {
							index++;
						}
					}
					if (index <= 0) {
						$scope.movies.push(i.movie);
					}
				}
			}
			console.log("movies", $scope.movies)

		}).catch(error => {
			console.log("Error", error)
		});
	}
	$scope.showFilm();
});