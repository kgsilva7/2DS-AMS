<?php
    $inicio = $_POST['inicio'];
    $final = $_POST['final'];
    
    $soma = 0;
    for ($i = $inicio; $i <= $final; $i++) {
        if ($i % 2 != 0) {
            $soma += $i;
        }
    }
    
    echo "Soma dos números ímpares entre " . $inicio . " e " . $final . " é: " . $soma;
?>
