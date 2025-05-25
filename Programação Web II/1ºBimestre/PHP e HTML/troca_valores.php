<?php
    $a = $_POST['a'];
    $b = $_POST['b'];
    
    $temp = $a;
    $a = $b;
    $b = $temp;
    
    echo "Novo valor de A: " . $a . "<br>";
    echo "Novo valor de B: " . $b;
?>
