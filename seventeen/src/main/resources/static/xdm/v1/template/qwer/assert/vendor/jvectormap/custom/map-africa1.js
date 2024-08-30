// Africa
$(function(){
	$('#mapAfrica').vectorMap({
		map: 'africa_mill',
		backgroundColor: '#f0f4f9',
		scaleColors: ['#0a8465'],
		zoomOnScroll:false,
		zoomMin: 1,
		hoverColor: true,
		series: {
			regions: [{
				values: gdpData,
				scale: ['#0a8465', '#102f73'],
				normalizeFunction: 'polynomial'
			}]
		},
	});
});