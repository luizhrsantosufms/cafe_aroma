package com.example.cafe_aroma;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Botão principal "Fazer Pedido"
        Button orderButton = findViewById(R.id.orderButton);
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pedido iniciado!", Toast.LENGTH_SHORT).show();
            }
        });

        // Interação com os itens do menu
        findViewById(R.id.itemEspresso).setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Espresso adicionado ao carrinho", Toast.LENGTH_SHORT).show());

        findViewById(R.id.itemCappuccino).setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Cappuccino adicionado ao carrinho", Toast.LENGTH_SHORT).show());

        findViewById(R.id.itemLatte).setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Latte adicionado ao carrinho", Toast.LENGTH_SHORT).show());

        findViewById(R.id.itemMocha).setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Mocha adicionado ao carrinho", Toast.LENGTH_SHORT).show());

        findViewById(R.id.itemGelado).setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Café Gelado adicionado ao carrinho", Toast.LENGTH_SHORT).show());

        findViewById(R.id.itemMacchiato).setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Macchiato adicionado ao carrinho", Toast.LENGTH_SHORT).show());

        // Ajuste de insets do sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
