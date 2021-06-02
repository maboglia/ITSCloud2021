<?php
$conn = mysqli_connect("localhost", "root", "", "cloud2021") or die(mysqli_error($conn));

$data = json_decode(file_get_contents('php://input'), true);

if ($_SERVER['REQUEST_METHOD'] == "POST"){
    mysqli_query($conn, "insert into videogames (nome, genere, valutazione) values ( '$data[nome]', '$data[genere]', $data[valutazione] )") or die(mysqli_error($conn));
}

if ($_SERVER['REQUEST_METHOD'] == "PUT"){
    mysqli_query($conn, "update videogames set nome='$data[nome]', genere='$data[genere]', valutazione=$data[valutazione] where id = $data[id]") or die(mysqli_error($conn));
}

if ($_SERVER['REQUEST_METHOD'] == "DELETE"){
    echo "delete from videogames where id = $_GET[id]";
    mysqli_query($conn, "delete from videogames where id = $_GET[id]") or die(mysqli_error($conn));
}


?>