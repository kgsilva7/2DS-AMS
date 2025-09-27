<?php
    $preco = $_POST['preco'];
    $porcentagem = $_POST['porcentagem'];
    $desconto = ($preco * $porcentagem) / 100;
    $preco_final = $preco - $desconto;
    echo "Preço Original: R$ " . number_format($preco, 2) . "<br>";
    echo "Desconto: R$ " . number_format($desconto, 2) . "<br>";
    echo "Preço Final: R$ " . number_format($preco_final, 2);

?>
