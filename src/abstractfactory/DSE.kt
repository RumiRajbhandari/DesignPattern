package abstractfactory

class DSE: User() {

    override fun getUserRole(): String {
        return "Order punch"
    }

}