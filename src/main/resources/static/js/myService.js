"use strict";
var app = angular.module("myApp", []); 
app.config(['$qProvider', function ($qProvider) {

    $qProvider.errorOnUnhandledRejections(false);

}]);

app.controller("myCtrl", ['$scope','$http',function($scope,$http) { 
	$scope.hello = "Hello World"; 
	
	// sessionStorage 사용
	sessionStorage.setItem("contextpath","localhost:8080");
	var cp = sessionStorage.getItem("contextpath","localhost:8080");
	
}]);
