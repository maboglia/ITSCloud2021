<?php

include 'Gioco.php';

$conn = mysqli_connect("localhost", "root", "", "cloud2021") or die(mysqli_error($conn));

$ident =  (isset($_GET['id']))?$_GET['id']:false;

$where = ($ident !== false)? " where id = " . $_GET['id']: ""; 

$result = mysqli_query($conn, "select * from videogames $where");

$giochi = [];

while ( $gioco = mysqli_fetch_object($result)      ) {
    $g = new Gioco($gioco->id, $gioco->nome, $gioco->genere, $gioco->valutazione);
    $giochi[] = $g;
}
header("Content-Type: application/json");
echo json_encode($giochi);



?>