<?php
    $nota1 = $_POST['nota1'];
    $nota2 = $_POST['nota2'];
    $nota3 = $_POST['nota3'];
    $nota4 = $_POST['nota4'];
    
    $media = ($nota1 + $nota2 + $nota3 + $nota4) / 4;
    
    echo "Média: " . number_format($media, 2) . "<br>";
    if ($media >= 6) {
        echo "Aprovado!";
    } elseif ($media < 3) {
        echo "Retido!";
    } else {
        echo "Exame!";
    }
?>
