let host = "localhost:8080/rest/cinemas";
const app = angular.module("app",[]);
app.controller("ctrl",function($scope,$http){
    $scope.address="Hồ Chí Minh";
    $scope.cinemas = [];
    
    $scope.reload_all = function(){
        var url=`${host}+"/${address}"`;
        $http.get(url,address).then(resp => {
            $scope.cinemas = resp.data;
            console.log("Success",resp)
        }).catch(error => {
            console.log("Error",error)
        });
    }    
    $scope.reload_all();

});