package david.dio_avengers_api.aplication.web.resource.response

import david.dio_avengers_api.domain.avenger.Avenger

data class AvengerResponse(
    val id: Long?,
    var nick: String,
    var person: String,
    var description: String?,
    var history: String?
) {
    companion object {
        fun from(avenger: Avenger) = AvengerResponse(
            id = avenger.id,
            nick = avenger.nick,
            person = avenger.person,
            description = avenger.description,
            history = avenger.history
        )
    }
}