# ☕ Café Aroma - Aplicativo Android

Um aplicativo mobile criado para gerenciar pedidos de uma cafeteria fictícia. Criado como parte de um projeto acadêmico, o **Café Aroma** oferece uma interface intuitiva, cadastro de usuários, listagem de cafés e carrinho de compras.

---

## 📱 Funcionalidades

- Tela de **login** e **cadastro de usuários**
- Lista de cafés disponíveis com **valores**
- Botões interativos para **adicionar itens ao carrinho**
- **Carrinho de compras** com visualização de itens e valor total
- Botão de **finalizar pedido**
- Banco de dados **SQLite local** para persistência dos usuários

---

## 🧪 Tecnologias Utilizadas

| Tecnologia       | Uso                         |
|------------------|-----------------------------|
| `Java`           | Lógica de programação       |
| `XML`            | Layouts Android             |
| `SQLite`         | Banco de dados local        |
| `Android Studio` | Ambiente de desenvolvimento |
| `ConstraintLayout`, `RecyclerView` | Interface responsiva e moderna |

---

## 📸 Screenshots

### 🏠 Tela Inicial  
> Com o nome da cafeteria e lista de cafés

### 🛒 Carrinho de Compras  
> Visualização dos itens adicionados

### 👤 Login & Cadastro  
> Cadastro com confirmação de senha e autenticação

*(Você pode adicionar imagens reais aqui depois, usando o botão "Upload file" do GitHub)*

---

## ⚙️ Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/cafe-aroma.git

Abra no Android Studio

Conecte um emulador ou dispositivo Android

Clique em Run ▶

📦 Gerar APK
No Android Studio:

Build > Build APK(s)
Depois, vá até:
/app/build/outputs/apk/debug/app-debug.apk

🗃️ Estrutura do Projeto
pgsql
Copiar
Editar
app/
├── java/com.example.cafe_aroma/
│   ├── MainActivity.java
│   ├── LoginActivity.java
│   ├── CadastroActivity.java
│   ├── CarrinhoActivity.java
│   ├── ItemCarrinho.java
│   ├── AdapterCarrinho.java
│   └── CarrinhoManager.java
├── res/layout/
│   ├── activity_main.xml
│   ├── activity_login.xml
│   ├── activity_cadastro.xml
│   ├── activity_carrinho.xml
│   └── item_carrinho.xml
📚 Licença
Este projeto foi desenvolvido para fins educacionais como parte do curso de Projeto Integrador em Tecnologia da Informação II da UFMS.

✍️ Autor
Luiz Henrique Ramos dos Santos
