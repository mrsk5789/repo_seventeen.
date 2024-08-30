// Denmark
$(function(){
	$('#mapDenmark').vectorMap({
		map: 'dk_mill',
		zoomOnScroll: false,
		regionStyle:{
			initial: {
				fill: '#0a8465',
			},
			hover: {
				"fill-opacity": 0.8
			},
			selected: {
				fill: '#ef2f1a'
			},
		},
		backgroundColor: '#f0f4f9',
	});
});