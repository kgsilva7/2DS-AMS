<?php
    $inicio = $_POST['inicio'];
    $final = $_POST['final'];
    
    echo "Números ímpares entre " . $inicio . " e " . $final . " em ordem decrescente:<br>";
    for ($i = $final; $i >= $inicio; $i--) {
        if ($i % 2 != 0) {
            echo $i . "<br>";
        }
    }
?>
