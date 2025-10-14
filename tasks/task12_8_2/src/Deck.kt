import kotlin.collections.shuffle
class Deck() {
    // Defines Card Class in Deck
    class Card(val rank: Card.Rank, val suit: Card.Suit){
        // Defines enum classes Required For Card
        enum class Rank(val symbol: Char) {
            Ace('A'),
            Two('2'),
            Three('3'),
            Four('4'),
            Five('5'),
            Six('6'),
            Seven('7'),
            Eight('8'),
            Nine('9'),
            Ten('T'),
            Jack('J'),
            Queen('Q'),
            King('K');

            val plainSymbol get() = name[0]

            override fun toString() = "$symbol"
        }

        enum class Suit(val symbol: Char) {
            Clubs('♣'),
            Diamonds('♦'),
            Hearts('♥'),
            Spades('♠');

            val plainSymbol get() = name[0]

            override fun toString() = "$symbol"
        }

        val plainSymbol get() = "$rank of $suit"

        override fun toString() = "$rank$suit"
    }

    val deckOfCard = buildList {
            for(rank in Card.Rank.entries){
                for(suit in Card.Suit.entries){
                    add(Card(rank, suit))
                }
            }
        }.toMutableList()
    
    init {
        shuffle()
    }
    fun shuffle() = deckOfCard.shuffle()
    override fun toString() = deckOfCard.joinToString("\n")
}