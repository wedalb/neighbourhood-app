import java.util.Date

data class User(
    val firstName:  String,
    val lastName:   String,
    val birthday: Date,

    val services: ArrayList<NeighborhoodService>
)

