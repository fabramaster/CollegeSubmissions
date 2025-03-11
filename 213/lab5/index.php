<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Lottery Tickets</title>
</head>
<body>
	<?php
	if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    	echo '<h1>Good Luck on Your Play!</h1>';
	} else {
    	echo '<h1>Welcome John Doe</h1>';
	}
	?>

	<form method="POST" action="index.php">
    	<input type="checkbox" name="lottery[]" value="lotto649"> LOTTO 6/49<br>
    	<input type="checkbox" name="lottery[]" value="lottomax"> LOTTO MAX<br>
    	<input type="submit" value="Generate Numbers">
	</form>

	<?php
	if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    	$lotteries = $_POST['lottery'];
    	if (in_array('lotto649', $lotteries)) {
        	echo '<h2>LOTTO 6/49 Numbers</h2>';
        	echo '<img src="lotto649.png" alt="LOTTO 6/49">';
        	generateLotto649();
    	}
    	if (in_array('lottomax', $lotteries)) {
        	echo '<h2>LOTTO MAX Numbers</h2>';
        	echo '<img src="lottomax.png" alt="LOTTO MAX">';
        	generateLottoMax();
    	}
	}

	function generateLotto649() {
    	echo '<table border="1">';
    	for ($i = 0; $i < 6; $i++) {
        	$numbers = range(1, 49);
        	shuffle($numbers);
        	$selected = array_slice($numbers, 0, 6);
        	sort($selected);
        	echo '<tr><td>' . implode('</td><td>', $selected) . '</td></tr>';
    	}
    	echo '</table>';
	}

	function generateLottoMax() {
    	echo '<table border="1">';
    	for ($i = 0; $i < 6; $i++) {
        	$numbers = range(1, 49);
        	shuffle($numbers);
        	$selected = array_slice($numbers, 0, 7);
        	sort($selected);
        	echo '<tr><td>' . implode('</td><td>', $selected) . '</td></tr>';
    	}
    	echo '</table>';
	}
	?>
</body>
</html>




