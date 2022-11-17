/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import java.sql.*;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karin
 */
public class telaProduto extends javax.swing.JFrame {

    /**
     * Creates new form telaProduto
     */
    public telaProduto() {
        initComponents();
    }

    public JTable getTbltblProduto() {
        return tblTelaProduto;
    }

    public void setTblTelaProduto(JTable tblTelaProduto) {
        this.tblTelaProduto = tblTelaProduto;
    }

    public JTextField getTxtBusca() {
        return txtBusca;
    }

    public void setTxtBusca(JTextField txtBusca) {
        this.txtBusca = txtBusca;
    }

    public JTextField getTxtCodigoProduto() {
        return txtCodigoProduto;
    }

    public void setTxtCodigoProduto(JTextField txtCodigoProduto) {
        this.txtCodigoProduto = txtCodigoProduto;
    }

    public JFormattedTextField getTxtPreco() {
        return txtPreco;
    }

    public void setTxtPreco(JFormattedTextField txtPreco) {
        this.txtPreco = txtPreco;
    }

    public JComboBox<String> getCbxTamanho_() {
        return cbxTamanho_;
    }

    public void setCbxTamanho(JComboBox<String> cbxTamanho_) {
        this.cbxTamanho_ = cbxTamanho_;
    }

    public JComboBox<String> getCbxCor() {
        return cbxCor;
    }

    public void setCbxCor(JComboBox<String> cbxCor) {
        this.cbxCor = cbxCor;
    }

    public JTextField getTxtProduto() {
        return txtProduto;
    }

    public void setTxtProduto(JTextField txtProduto) {
        this.txtProduto = txtProduto;
    }

    public JFormattedTextField getTxtQtd() {
        return txtQtd;
    }

    public void setTxtQtd(JFormattedTextField txtQtd) {
        this.txtQtd = txtQtd;
    }

    public JComboBox<String> getCbxTipo() {
        return cbxTipo;
    }

    public void setCbxTipo(JComboBox<String> cbxTipo) {
        this.cbxTipo = cbxTipo;
    }

    public boolean validaCamposVazios() {
        // Valida se os campos obrigatorios estao preenchidos
        String cv = null;

        if (txtPreco.getText().isEmpty()) {
            cv += ", Preco";
        }
        if (cbxTamanho_.getSelectedItem() == "Selecionar") {
            cv += ", Tamanho";
        }
        if (cbxCor.getSelectedItem() == "Selecionar") {
            cv += ", Cor";
        }
        if (txtProduto.getText().isEmpty()) {
            cv += ", Produto";
        }
        if (txtQtd.getText().isEmpty()) {
            cv += ", Quantidade";
        }
        if (cbxTipo.getSelectedItem() == "Selecionar") {
            cv += ", Tipo";
        }

        if (cv != null) {
            cv = cv.substring(2, (cv.length()));
            JOptionPane.showMessageDialog(this, "Preencha os campos vazios.\n" + cv, "Aviso", JOptionPane.WARNING_MESSAGE);
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTelaProduto = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxTamanho = new javax.swing.JLabel();
        cbxTamanho_ = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxCor = new javax.swing.JComboBox<>();
        lblPreco = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        txtQtd = new javax.swing.JFormattedTextField();
        txtPreco = new javax.swing.JFormattedTextField();
        btnAdiocionarItem = new javax.swing.JButton();
        btnAtualizarItem = new javax.swing.JButton();
        btnLimparDados = new javax.swing.JButton();
        btnRemoverItem = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PESQUISA E CADASTRO DE PRODUTOS");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 0, 0), null, null));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)), "BUSCA", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 0, 24), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CÓDIGO/PRODUTO:");

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblTelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "PREÇO (R$) ", "TAMANHO", "COR", "PRODUTO", "QTD", "TIPO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTelaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTelaProduto);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        lblCodigo.setBackground(new java.awt.Color(255, 255, 255));
        lblCodigo.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("CÓDIGO:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRODUTO");

        cbxTamanho.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        cbxTamanho.setForeground(new java.awt.Color(255, 255, 255));
        cbxTamanho.setText("TAMANHO:");

        cbxTamanho_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "P", "PP\t", "M\t", "G\t", "GG", "EXG", "EGG", "32", "34", "44", "46", "48", "50", "52", "\t", " ", " ", " " }));

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QTD.:");

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cor :");

        cbxCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Amarelo", "Azul", "Verde", "Preto", "Branco", "Rosa", "Vermelho", "Jeans", " ", " " }));

        lblPreco.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco.setText("*PREÇO: (R$)");

        txtCodigoProduto.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtCodigoProdutoInputMethodTextChanged(evt);
            }
        });
        txtCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdutoActionPerformed(evt);
            }
        });
        txtCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoProdutoKeyTyped(evt);
            }
        });

        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TIPO:");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Calça", "Camisa", "Camiseta", "Moletom", "Blusa", "Moda Intima", " ", " " }));

        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });
        txtQtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtdKeyTyped(evt);
            }
        });

        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        txtPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecoKeyTyped(evt);
            }
        });

        btnAdiocionarItem.setBackground(new java.awt.Color(0, 0, 0));
        btnAdiocionarItem.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        btnAdiocionarItem.setForeground(new java.awt.Color(255, 255, 255));
        btnAdiocionarItem.setText("ADICIONAR  ITEM");
        btnAdiocionarItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        btnAdiocionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdiocionarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAdiocionarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProduto))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblCodigo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigoProduto))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(cbxTamanho)
                                        .addGap(16, 16, 16)
                                        .addComponent(cbxTamanho_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxCor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblPreco)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(54, 54, 54))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cbxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxTamanho_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxTamanho, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addComponent(btnAdiocionarItem, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        btnAdiocionarItem.getAccessibleContext().setAccessibleName("");

        btnAtualizarItem.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarItem.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        btnAtualizarItem.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarItem.setText("ATUALIZAR ITEM");
        btnAtualizarItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        btnAtualizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarItemActionPerformed(evt);
            }
        });

        btnLimparDados.setBackground(new java.awt.Color(0, 0, 0));
        btnLimparDados.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        btnLimparDados.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparDados.setText("LIMPAR DADOS");
        btnLimparDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        btnLimparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparDadosActionPerformed(evt);
            }
        });

        btnRemoverItem.setBackground(new java.awt.Color(0, 0, 0));
        btnRemoverItem.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        btnRemoverItem.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverItem.setText("REMOVER ITEM");
        btnRemoverItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        btnRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverItemActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(0, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("VOLTAR");
        btnVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualizarItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimparDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoverItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnAtualizarItem, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparDados, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverItem, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        btnAtualizarItem.getAccessibleContext().setAccessibleName("");
        btnLimparDados.getAccessibleContext().setAccessibleName("");
        btnRemoverItem.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdActionPerformed

    private void txtQtdKeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if (!txtQtd.getText().equals("")) {
            try {
                Double.parseDouble(txtQtd.getText().replaceAll(",", "."));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Este campo não aceita letras. Por favor digite um valor numerico.");
            }
        }
    }

    private void btnAdiocionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdiocionarItemActionPerformed
        // TODO add your handling code here:
        if (txtCodigoProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Este codigo do produto.");
        }
        if (txtPreco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Este preço.");
        }
        if (cbxTamanho_.getSelectedItem() == null || cbxTamanho_.getSelectedItem() == "") {
            JOptionPane.showMessageDialog(this, "tamanho.");
        }
        if (cbxCor.getSelectedItem() == null || cbxCor.getSelectedItem() == "") {
            JOptionPane.showMessageDialog(this, "Cor.");
        }
        if (txtProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "produto.");
        }
        if (txtQtd.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Qtd");
        }
        if (cbxTipo.getSelectedItem() == null || cbxTipo.getSelectedItem() == "") {
            JOptionPane.showMessageDialog(this, "Tipo.");
        }
        DefaultTableModel model = (DefaultTableModel) tblTelaProduto.getModel();
        model.addRow(new Object[]{txtCodigoProduto.getText(), txtPreco.getText(), cbxTamanho_.getSelectedItem(), cbxCor.getSelectedItem(), txtProduto.getText(), txtQtd.getText(), cbxTipo.getSelectedItem()});
        limparDados();
    }//GEN-LAST:event_btnAdiocionarItemActionPerformed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void btnAtualizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarItemActionPerformed
        // TODO add your handling code here:

        boolean achei = false;
        for (int i = 0; i < tblTelaProduto.getRowCount(); ++i) {
            if (tblTelaProduto.getValueAt(i, 0).equals(txtCodigoProduto.getText().trim())) {
                tblTelaProduto.setValueAt(txtCodigoProduto.getText().trim(), i, 0);
                tblTelaProduto.setValueAt(txtPreco.getText().trim(), i, 1);
                tblTelaProduto.setValueAt(cbxTamanho_.getSelectedItem(), i, 2);
                tblTelaProduto.setValueAt(cbxCor.getSelectedItem(), i, 3);
                tblTelaProduto.setValueAt(txtProduto.getText().trim(), i, 4);
                tblTelaProduto.setValueAt(txtQtd.getText(), i, 5);
                tblTelaProduto.setValueAt(cbxTipo.getSelectedItem(), i, 6);
                achei=true;
                limparDados();
                break;
            }
        }

        if (!achei) {
            JOptionPane.showMessageDialog(this, "valor não encontrado na tabela");
        }else{
            JOptionPane.showMessageDialog(this, "Valor atualizado com sucesso!!");
        }
    }//GEN-LAST:event_btnAtualizarItemActionPerformed

    private void btnLimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDadosActionPerformed
        // TODO add your handling code here:
        limparDados();
    }//GEN-LAST:event_btnLimparDadosActionPerformed

    private void limparDados() {
        txtCodigoProduto.setText("");
        txtPreco.setText("");
        cbxTamanho_.setSelectedIndex(0);
        cbxCor.setSelectedIndex(0);
        txtProduto.setText("");
        txtQtd.setText("");
        cbxTipo.setSelectedIndex(0);
    }
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProdutoActionPerformed

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtCodigoProdutoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtCodigoProdutoInputMethodTextChanged
        // TODO add your handling code here:


    }//GEN-LAST:event_txtCodigoProdutoInputMethodTextChanged

    private void txtCodigoProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProdutoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();  // if it's not a number, ignore the event
        }
    }//GEN-LAST:event_txtCodigoProdutoKeyTyped

    private void txtPrecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoKeyTyped

        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9') && (c != KeyEvent.VK_BACK_SPACE))) {
            if (c != ',') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtPrecoKeyTyped

    private void txtQtdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtdKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();  // if it's not a number, ignore the event
        }
    }//GEN-LAST:event_txtQtdKeyTyped

    private void tblTelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTelaProdutoMouseClicked
        // TODO add your handling code here:
        JTable target = (JTable) evt.getSource();
        int row = target.getSelectedRow(); // select a row
        txtCodigoProduto.setText(tblTelaProduto.getValueAt(row, 0).toString());
        txtPreco.setText(tblTelaProduto.getValueAt(row, 1).toString());
        cbxTamanho_.setSelectedItem(tblTelaProduto.getValueAt(row, 2).toString());
        cbxCor.setSelectedItem(tblTelaProduto.getValueAt(row, 3).toString());
        txtProduto.setText(tblTelaProduto.getValueAt(row, 4).toString());
        txtQtd.setText(tblTelaProduto.getValueAt(row, 5).toString());
        cbxTipo.setSelectedItem(tblTelaProduto.getValueAt(row, 6).toString());
    }//GEN-LAST:event_tblTelaProdutoMouseClicked

    private void btnRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverItemActionPerformed
        // TODO add your handling code here:
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja remover este item?", "", JOptionPane.YES_NO_OPTION);

        //verfica se a resposta é verdadeira
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, tblTelaProduto.getSelectedRow());
            if (tblTelaProduto.getSelectedRow() >= 0) {
                DefaultTableModel model = (DefaultTableModel) tblTelaProduto.getModel();
                model.removeRow(tblTelaProduto.getSelectedRow());
            }
        }
    }//GEN-LAST:event_btnRemoverItemActionPerformed

    private void txtPrecoKeyReleased(java.awt.event.KeyEvent evt) {
        // Validação da entrada de preco
        if (!txtPreco.getText().equals("")) {
            try {
                Double.parseDouble(txtPreco.getText().replaceAll(",", "."));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Este campo não aceita letras. Por favor digite um valor numerico.");
            }
        }
    }

    private void txtProdutoKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:

        //PERMITE DIGITAR APENAS LETRAS
        char c = evt.getKeyChar();

        //Aqui verificamos se o que foi digitado é um número, um backspace ou um delete. Se for, consumimos o evento, ou seja, o jTextField não receberá o valor digitado
        if (((c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdiocionarItem;
    private javax.swing.JButton btnAtualizarItem;
    private javax.swing.JButton btnLimparDados;
    private javax.swing.JButton btnRemoverItem;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbxCor;
    private javax.swing.JLabel cbxTamanho;
    private javax.swing.JComboBox<String> cbxTamanho_;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JTable tblTelaProduto;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JFormattedTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
