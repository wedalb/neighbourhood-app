/**
 * This data class defines a neighborhood service that a person can offer
 */
data class NeighborhoodService(
    val id:     String,
    val name:   String,
    val provider: User,
    val category: ServiceCategory
)
