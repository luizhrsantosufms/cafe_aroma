package com.example.cafe_aroma;

import android.content.Intent;
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

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide(); // Oculta a ActionBar
        }

        // Botão "Fazer Pedido" (pode virar finalizar no futuro)
        Button orderButton = findViewById(R.id.orderButton);
        orderButton.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Pedido iniciado!", Toast.LENGTH_SHORT).show()
        );

        // Botões dos cafés
        findViewById(R.id.itemEspresso).setOnClickListener(v -> {
            CarrinhoManager.getInstancia().adicionarItem(new ItemCarrinho("Espresso", 5.00));
            Toast.makeText(this, "Espresso adicionado ao carrinho", Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.itemCappuccino).setOnClickListener(v -> {
            CarrinhoManager.getInstancia().adicionarItem(new ItemCarrinho("Cappuccino", 7.00));
            Toast.makeText(this, "Cappuccino adicionado ao carrinho", Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.itemLatte).setOnClickListener(v -> {
            CarrinhoManager.getInstancia().adicionarItem(new ItemCarrinho("Latte", 6.50));
            Toast.makeText(this, "Latte adicionado ao carrinho", Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.itemMocha).setOnClickListener(v -> {
            CarrinhoManager.getInstancia().adicionarItem(new ItemCarrinho("Mocha", 8.00));
            Toast.makeText(this, "Mocha adicionado ao carrinho", Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.itemGelado).setOnClickListener(v -> {
            CarrinhoManager.getInstancia().adicionarItem(new ItemCarrinho("Café Gelado", 6.00));
            Toast.makeText(this, "Café Gelado adicionado ao carrinho", Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.itemMacchiato).setOnClickListener(v -> {
            CarrinhoManager.getInstancia().adicionarItem(new ItemCarrinho("Macchiato", 7.50));
            Toast.makeText(this, "Macchiato adicionado ao carrinho", Toast.LENGTH_SHORT).show();
        });

        // Botão "Ver Carrinho"
        findViewById(R.id.btnCarrinho).setOnClickListener(v -> {
            startActivity(new Intent(this, CarrinhoActivity.class));
        });

        // Ajuste visual
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
