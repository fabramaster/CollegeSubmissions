
<?php

if (isset($_POST['submit'])) {
    $year = $_POST['years'];
    $mysqli = mysqli_connect("localhost", "root", "ARoss", "testDB");
    $sql = "SELECT Q1,Q2,Q3,Q4 FROM sales WHERE year = " . $year . "";
    $result = mysqli_query($mysqli, $sql);
    $q1;
    $q2;
    $q3;
    $q4;
    $total;
    if (mysqli_num_rows($result) == 1) {

        while ($info = mysqli_fetch_array($result)) {
            $q1 = stripslashes($info['Q1']);
            //echo $q1;
            //echo '<br>';
            $q2 = stripslashes($info['Q2']);
            //echo $q2;
            //echo '<br>';
            $q3 = stripslashes($info['Q3']);
            //echo $q3;
            //echo '<br>';
            $q4 = stripslashes($info['Q4']);
            //echo $q4;
            //echo '<br>';
        }
        $total = $q1 + $q2 + $q3 + $q4;

        //echo $total;
        //echo '<br>';
        $q1_percentage = round($q1/$total,3)*100;
        $q1la = substr($q1/$total*100,0,4)."%";
        //echo $q1_percentage;
        //echo '<br>';
        $q2_percentage = round($q2/$total,3)*100;
        $q2la = substr($q2/$total*100,0,4)."%";
        //echo '<br>';
        $q3_percentage = round($q3/$total,3)*100;
        $q3la = substr($q3/$total*100,0,4)."%";
        //echo $q3_percentage;
        //echo '<br>';
        $q4_percentage = round($q4/$total,3)*100;
        $q4la = substr($q4/$total*100,0,4)."%";
        //echo $q4_percentage;
        //echo '<br>';
            //create the canvas
        echo "<style>
	.pie-chart {
		background:
			radial-gradient(
				circle closest-side,
				transparent 66%,
				white 0
			),
			conic-gradient(
				#4e79a7 0,
				#4e79a7 28.4%,
				#f28e2c 0,
				#f28e2c 52.4%,
				#76b7b2 0,
				#76b7b2 72.5%,
				#59a14f 0,
				#59a14f 100%
				
		);
		position: relative;
		width: 500px;
		min-height: 350px;
		margin: 0;
		outline: 1px solid #ccc;
	}
	.pie-chart h2 {
		position: absolute;
		margin: 1rem;
	}
	.pie-chart cite {
		position: absolute;
		bottom: 0;
		font-size: 80%;
		padding: 1rem;
		color: gray;
	}
	.pie-chart figcaption {
		position: absolute;
		bottom: 1em;
		right: 1em;
		font-size: smaller;
		text-align: right;
	}
	.pie-chart span:after {
		display: inline-block;
		content: '';
		width: 0.8em;
		height: 0.8em;
		margin-left: 0.4em;
		height: 0.8em;
		border-radius: 0.2em;
		background: currentColor;
	}
</style>
<figure class='pie-chart'>
	<h2>Quarterly Sales For the Year: ".$year."</h2>
	<figcaption>
		<span style='color:#4e79a7'>Q1--".$q1la."</span><br>
		<span style='color:#f28e2c'>Q2--".$q2la."</span><br>
		<span style='color:#76b7b2'>Q3--".$q3la."</span><br>
		<span style='color:#59a14f'>Q4--".$q4la."</span>
		
	</figcaption>
	
</figure>";
        
    }
} else {
    echo "<form action='salespie.php' method='post'>";
    echo "<select name = 'years'>";
    echo "<option value = 2020>2020</option>";
    echo "<option value = 2019>2019</option>";
    echo "<option value = 2018>2018</option>";
    echo "</select><br>";
    echo "<input type = 'submit' name = 'submit'> ";
    echo "</form>";
}


    ?>

