package br.com.simao.steaminventory.core;

import br.com.simao.steaminventory.item.Item;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Transacao extends Entidade {

    @ManyToOne
    private Item item;

    @ManyToOne
    private Usuario dono;

    private BigDecimal valorCompra;
    private Date dataCompra;
    private BigDecimal valorVenda;
    private Date dataVenda;
    private Boolean isVendido;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }

    public BigDecimal getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(BigDecimal valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Boolean getVendido() {
        return isVendido;
    }

    public void setVendido(Boolean vendido) {
        isVendido = vendido;
    }
}
