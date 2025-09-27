<?php
    $numero = $_POST['numero'];
    
    if ($numero % 2 == 0) {
        echo "O número " . $numero . " é Par.";
    } else {
        echo "O número " . $numero . " é Ímpar.";
    }
?>
