<?php
//          0          1
$nani = ["PISOLO", "MAMMOLO"];
$nani[] = "eolo";
//            2

$auto1 = [
    "marca" => "Fiat",
    "modello" => "500",
    "colore"=> "giallo"
];

$auto2 = [
    "marca" => "Toyota",
    "modello" => "Yaris",
    "colore"=> "verde"
];

$automobili = [$auto1, $auto2];


echo in_array("PISOLO", $nani);


// for ($i=0; $i < count($nani); $i++){
//     echo $nani[$i];
// }

foreach ($automobili as $key => $value) {
    echo $key .": " . $value['marca'] ."<br>";
}




?>