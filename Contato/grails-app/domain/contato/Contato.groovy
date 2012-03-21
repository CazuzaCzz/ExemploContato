package contato

class Contato {
	
	String nome
	String email
	String endereco
	String mensagem
	
    static constraints = {
		nome(nullable:false, blank:false, maxSize:64)
		endereco(nullable:false, blank:false, maxSize:255)
		email(nullable:false,blank:false ,unique:true ,maxSize:128,email:true)
		mensagem(nullable:false, blank:false, maxSize:1000)
    }
}
