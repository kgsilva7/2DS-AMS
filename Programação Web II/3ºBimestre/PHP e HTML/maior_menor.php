<?php
    $num1 = $_POST['num1'];
    $num2 = $_POST['num2'];
    $num3 = $_POST['num3'];
    
    $maior = max($num1, $num2, $num3);
    $menor = min($num1, $num2, $num3);
    
    echo "Maior número: " . $maior . "<br>";
    echo "Menor número: " . $menor;
?>
