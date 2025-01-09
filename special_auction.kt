fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return if (bid?.amount == null) {
        minimumPrice
    } else if (bid.amount > minimumPrice){
        bid.amount
    } else {
        minimumPrice
    }

    // It just says: return 'bid?.amount' (which can be null) ?: -> if null return minimumPrice else bid.amount
    //return bid?.amount ?: minimumPrice
}
