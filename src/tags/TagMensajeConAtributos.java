package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class TagMensajeConAtributos implements Tag {
	
	private PageContext contexto;
	// Declarar atributos: estos seran ingresados en el JSP
	private String color;
	private String texto;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter outHTML = contexto.getOut();
		try {
			outHTML.write("<font color='" + this.color + "'>");
			outHTML.write(this.texto);
			outHTML.write("</font>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPageContext(PageContext arg0) {
		contexto = arg0;
	}

	@Override
	public void setParent(Tag arg0) {
		// TODO Auto-generated method stub

	}

}
