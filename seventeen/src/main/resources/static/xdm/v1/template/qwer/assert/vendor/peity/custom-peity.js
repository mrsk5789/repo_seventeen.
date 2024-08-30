$(function() {
	var updatingChart = $(".updating-chart-one").peity("line", {
		width: 150,
		height: 30,
		stroke: "#0a8465",
		fill: false,
		strokeWidth: 3,
	});
	setInterval(function() {
		var random = Math.round(Math.random() * 10)
		var values = updatingChart.text().split(",")
		values.shift()
		values.push(random)

		updatingChart
		.text(values.join(","))
		.change()
	}, 1000)
})
$(function() {
	var updatingChart = $(".updating-chart-two").peity("line", {
		width: 150,
		height: 30,
		stroke: "#0a8465",
		fill: false,
		strokeWidth: 3,
	});
	setInterval(function() {
		var random = Math.round(Math.random() * 10)
		var values = updatingChart.text().split(",")
		values.shift()
		values.push(random)

		updatingChart
		.text(values.join(","))
		.change()
	}, 1000)
})
$(function() {
	var updatingChart = $(".updating-chart-three").peity("line", {
		width: 150,
		height: 30,
		stroke: "#0a8465",
		fill: false,
		strokeWidth: 3,
	});
	setInterval(function() {
		var random = Math.round(Math.random() * 10)
		var values = updatingChart.text().split(",")
		values.shift()
		values.push(random)

		updatingChart
		.text(values.join(","))
		.change()
	}, 1000)
})
$(function() {
	var updatingChart = $(".updating-chart-four").peity("line", {
		width: 150,
		height: 30,
		stroke: "#ef2f1a",
		fill: false,
		strokeWidth: 3,
	});
	setInterval(function() {
		var random = Math.round(Math.random() * 10)
		var values = updatingChart.text().split(",")
		values.shift()
		values.push(random)

		updatingChart
		.text(values.join(","))
		.change()
	}, 1000)
})