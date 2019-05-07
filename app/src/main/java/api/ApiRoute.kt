package api

sealed class ApiRoute{
    val timeOut: Int
    get(){
        return 3000
    }
}
val baseUrl: String
    get(){
        return "https://api.nasa.gov/planetary/apod?api_key=N7hK9oubdbPNs1Um83Hp6WwzyXo4kzp1q8sZjyPW"
    }
