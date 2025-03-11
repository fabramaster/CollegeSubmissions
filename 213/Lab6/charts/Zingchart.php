<?php
if (isset($_POST['submit'])) {
    $year = $_POST['years'];
    $mysqli = mysqli_connect("localhost", "root", "ARoss", "testDB");
    $sql = "SELECT Q1,Q2,Q3,Q4 FROM sales WHERE year = " . $year . "";
    $result = mysqli_query($mysqli, $sql);

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
        $q1_percentage = round($q1,1);
        //echo $q1_percentage;
        //echo '<br>';
        $q2_percentage = round($q2,1);
        //echo $q2_percentage;
        //echo '<br>';
        $q3_percentage = round($q3,1);
       // echo $q3_percentage;
        //echo '<br>';
        $q4_percentage = round($q4,1);
        //echo $q4_percentage;
        //echo '<br>';
        
        
        echo "<!DOCTYPE html>
<html>
<script type='text/javascript' src='https://www.gstatic.com/charts/loader.js'></script>

<body>
<div
id='myChart' style='width:100%; max-width:600px; height:500px;'>
</div>

<script>
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

function drawChart() {
var data = google.visualization.arrayToDataTable([
  ['Quantity', 'million'],
  ['Q1',".$q1_percentage."],
  ['Q2',".$q2_percentage."],
  ['Q3',".$q3_percentage."],
  ['Q4',".$q4_percentage."]
  
]);

var options = {
  title:'Sales ".$year." (in millions)' 
};

var chart = new google.visualization.BarChart(document.getElementById('myChart'));
  chart.draw(data, options);
}
</script>

</body>
</html>";
        
    }
} else {
    echo "<form action='Zingchart.php' method='post'>";
    echo "<select name = 'years'>";
    echo "<option value = 2020>2020</option>";
    echo "<option value = 2019>2019</option>";
    echo "<option value = 2018>2018</option>";
    echo "</select><br>";
    echo "<input type = 'submit' name = 'submit'> ";
    echo "</form>";
}
?>