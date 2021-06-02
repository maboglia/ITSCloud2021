<?php

$films=[];

$films[] = ['id'=>1, "titolo"=>"PETITE MAMAN", "genere"=>"drammatico"];
$films[] = ['id'=>2, "titolo"=>"YOUR NAME.", "genere"=>"animazione"];
$films[] = ['id'=>3, "titolo"=>"THE YOUNG POPE", "genere"=>"commedia"];
$films[] = ['id'=>4, "titolo"=>"SULLY", "genere"=>"drammatico"];


//var_dump($films);
header("Content-Type: application/json");

if(isset($_GET['id'])){
    $bool=false;
    foreach ($films as $key => $value) {
        if ($films[$key]['id']==$_GET['id']){
            echo json_encode($films[$key]);
            $bool = true;
            break;    
        }
    
        }
    if (!$bool) 
        echo '{"errore":"non disponibile"}';

} else {
    echo json_encode($films);
}



?>