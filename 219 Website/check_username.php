<?php
// Connect to MySQL (replace these values with your database credentials)
$servername = "your_servername";
$username = "your_username";
$password = "your_password";
$dbname = "your_database";

$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

if (isset($_POST["username"])) {
    $username = $_POST["username"];

    // Check if the username is unique
    $sql = "SELECT * FROM users WHERE username = '$username'";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        echo "Username is not unique. Choose another.";
    } else {
        echo "Username is unique. You can proceed.";
    }
} else {
    echo "Invalid request";
}

$conn->close();
?>
