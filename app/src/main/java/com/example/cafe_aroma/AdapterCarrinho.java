package com.example.cafe_aroma;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterCarrinho extends RecyclerView.Adapter<AdapterCarrinho.ViewHolder> {

    private List<ItemCarrinho> itens;

    public AdapterCarrinho(List<ItemCarrinho> itens) {
        this.itens = itens;
    }

    @NonNull
    @Override
    public AdapterCarrinho.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_carrinho, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCarrinho.ViewHolder holder, int position) {
        ItemCarrinho item = itens.get(position);
        holder.nome.setText(item.getNome());
        holder.preco.setText(String.format("R$ %.2f", item.getPreco()));
    }

    @Override
    public int getItemCount() {
        return itens.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nome, preco;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.textNomeItem);
            preco = itemView.findViewById(R.id.textPrecoItem);
        }
    }
}
