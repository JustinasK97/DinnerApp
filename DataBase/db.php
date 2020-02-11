<?php
$servername = "localhost";
$username = "id7924278_dinner";
$password - "123456";
$dbname = "id7924278_dinner";
//Create connection
$conn = new mysqli ($servername, $username, $password, $dbname);
//Check connection
if ($conn->connect_error){
die("Connection failed: " . $conn->connect_error);
}
if (isset($_POST[‘insert‘])) {
$data = $_POST['data'];
$type = $_POST( 'type'];
$delivery = $_POST['delivery'];
$price = $_POST['price'];
$payment = $_POST['type'];
sql = "INSERT INTO dinner(data, type, delivery, price, payment) VALUES('data', 'type', 'delivery','price','payment')";
if ($conn->query($sql) === TRUE){
echo "New record created successfuly";
}else{
        echo "Error: " . $sql . "<br>" . $conn ->error;
}
}
$conn->close();
?>