<?php

if (isset($_REQUEST['colore'])){
$colore = $_REQUEST['colore'];
} 


?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body style="background-color: <?=$colore?>">

    <a href="?colore=red">rosso</a> 
    <a href="?colore=green">verde</a> 
    <a href="?colore=blue">blu</a> 

    <form action="" method="post">
        <input type="text" name="colore" id="colour">
        <input type="submit" value="cambia">
    </form>

    <?= $_POST['colour'] ?>


</body>
</html>