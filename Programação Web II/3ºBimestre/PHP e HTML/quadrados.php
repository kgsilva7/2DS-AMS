<?php
    $num1 = $_POST['num1'];
    $num2 = $_POST['num2'];
    $num3 = $_POST['num3'];
    
    $soma_quadrados = ($num1 * $num1) + ($num2 * $num2) + ($num3 * $num3);
    
    echo "Soma dos Quadrados: " . $soma_quadrados;
?>
