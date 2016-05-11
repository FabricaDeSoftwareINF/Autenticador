package br.ufg.inf.fabrica.ldapinfautenticador;


/**
 *
 * @author danilloguimaraes
 */
public interface ILdapAutenticador {
    
    /**
     * Guarda estado da autenticidade da credencial informada no método autenticar
     * @return 
     * True se credencial informada no método autenticar é válida.
     * False se credencial informada no método autenticar é inválida.
     */
    public boolean isCredencialValida();
    
    /**
     * Se credencial for válida, guarda o atributo uidNumber no ldap
     * @return 
     */
    public long getId();

    /**
     * Se credencial for válida, guarda o atributo cn no ldap
     * @return 
     */
    public String getNome();

    /**
     * Se credencial for válida, guarda o atributo cn no ldap
     * @return 
     */
    public String getEmail();
}
