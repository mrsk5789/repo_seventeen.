// Europe
$(function(){
	$('#mapEurope').vectorMap({
		map: 'europe_mill',
		zoomOnScroll: false,
		series: {
			regions: [{
				values: gdpData,
				scale: ['#0a8465', '#102f73'],
				normalizeFunction: 'polynomial'
			}]
		},
		backgroundColor: '#f0f4f9',
	});
});