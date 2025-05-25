<?php
    $salario_bruto = $_POST['salario_bruto'];
    
    $gratificacao = ($salario_bruto * 10) / 100;
    $imposto = ($salario_bruto * 20) / 100;
    
    $salario_liquido = $salario_bruto + $gratificacao - $imposto;
    
    echo "Salário Bruto: R$ " . number_format($salario_bruto, 2) . "<br>";
    echo "Gratificação: R$ " . number_format($gratificacao, 2) . "<br>";
    echo "Imposto: R$ " . number_format($imposto, 2) . "<br>";
    echo "Salário Líquido: R$ " . number_format($salario_liquido, 2);
?>
