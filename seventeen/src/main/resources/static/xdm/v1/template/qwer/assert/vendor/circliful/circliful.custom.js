$( document ).ready(function() {
	$("#likes").circliful({
		animation: 1,
		animationStep: 5,
		foregroundBorderWidth: 10,
		backgroundBorderWidth: 5,
		percent: 78,
		fontColor: '#000000',
		foregroundColor: '#0a8465',
		backgroundColor: '#e6ecf3',
		multiPercentage: 1,
		percentages: [10, 20, 30],
	});
	$("#shares").circliful({
		animation: 1,
		animationStep: 5,
		foregroundBorderWidth: 10,
		backgroundBorderWidth: 5,
		percent: 65,
		fontColor: '#000000',
		foregroundColor: '#0a8465',
		backgroundColor: '#e6ecf3',
		multiPercentage: 1,
		percentages: [10, 20, 30],
	});
	$("#comments").circliful({
		animation: 1,
		animationStep: 5,
		foregroundBorderWidth: 10,
		backgroundBorderWidth: 5,
		percent: 85,
		fontColor: '#000000',
		foregroundColor: '#ef2f1a',
		backgroundColor: '#e6ecf3',
		multiPercentage: 1,
		percentages: [10, 20, 30],
	});

});