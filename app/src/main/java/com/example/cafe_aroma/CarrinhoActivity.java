package com.example.cafe_aroma;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarrinhoActivity extends AppCompatActivity {

    RecyclerView recyclerCarrinho;
    TextView textTotal;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);

        // Ativar botão de voltar na barra superior
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Voltar"); // Define o título como "Voltar"
        }

        recyclerCarrinho = findViewById(R.id.recyclerCarrinho);
        textTotal = findViewById(R.id.textTotal);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        // Obter os itens do carrinho
        List<ItemCarrinho> lista = CarrinhoManager.getInstancia().getItens();

        // Configurar RecyclerView
        AdapterCarrinho adapter = new AdapterCarrinho(lista);
        recyclerCarrinho.setLayoutManager(new LinearLayoutManager(this));
        recyclerCarrinho.setAdapter(adapter);

        // Calcular e mostrar total
        double total = CarrinhoManager.getInstancia().calcularTotal();
        textTotal.setText(String.format("Total: R$ %.2f", total));

        // Botão "Finalizar Pedido"
        btnFinalizar.setOnClickListener(v -> {
            Toast.makeText(this, "Pedido finalizado com sucesso!", Toast.LENGTH_SHORT).show();
            CarrinhoManager.getInstancia().limparCarrinho();
            finish(); // Fecha a tela do carrinho
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish(); // Fecha a tela e volta para a anterior
        return true;
    }
}
