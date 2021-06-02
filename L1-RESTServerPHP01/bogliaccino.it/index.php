
    <?php
    header("content-type: application/json");
    if ( isset($_GET['peso'])  && isset($_GET['altezza'])   ){
        echo "{";
            echo '"peso":' . $_GET['peso'] . ',';
            //echo "<br>";
            echo '"altezza":' . $_GET['altezza'] . ',';
            // echo "<br>";
            echo '"BMI":' . ($_GET['peso']/($_GET['altezza']*$_GET['altezza']));
        echo "}";
        }


/*
< 16.5	GRAVE MAGREZZA
16-18,49	SOTTOPESO
18.5-24,99   	NORMOPESO
25-29,99	SOVRAPPESO
30-34,99	OBESITÀ CLASSE I (lieve)
35-39,99	OBESITÀ CLASSE II (media)
> 40	OBESITÀCLASSE III (grave)

*/






/*
        $numero = 10;

        if($_GET['numero']){
            $numero = (int) $_GET['numero'];
        }

        for ($i=0; $i < $numero; $i++) { 
            echo "<li>";
            echo 'hello, world';
            echo "</li>";
        }
*/    ?>
