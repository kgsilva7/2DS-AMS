<?php
    $numero = $_POST['numero'];
    echo "<h1>Tabuada do " . $numero . "</h1>";
    for ($i = 1; $i <= 10; $i++) {
        echo $numero . " x " . $i . " = " . ($numero * $i) . "<br>";
    }
?>