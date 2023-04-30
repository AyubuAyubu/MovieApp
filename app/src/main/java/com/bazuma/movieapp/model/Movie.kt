package com.bazuma.movieapp.model

data class Movie(
    val id:String,
    val title:String,
    val year :String,
    val genre:String,
    val actors:String,
    val plot:String,
    val images:List<String>,
    val rating:String
)

fun getMovie():List<Movie>{
    return listOf(
        Movie(
            "tt0011112",
            "Scream VI",
            "2023",
            "Horror, Mystery, Thriller",
            "Courteney CoxMelissa BarreraJenna Ortega",
            "In the next installment, the survivors of the Ghostface killings leave Woodsboro behind and start a fresh chapter in New York City.",
            images =  listOf(
                "https://www.imdb.com/title/tt17663992/mediaviewer/rm91108353/",
                "https://yts.mx/movies/scream-vi-2023"),
             "8.0"
            ),

        Movie(
            "tt7126948",
            "Hamilton",
            "2020",
            "Musical, Drama, History",
            "Lin-Manuel Miranda, Phillipa Soo, Leslie Odom Jr.",
            "The real life of one of America's foremost founding fathers and first Secretary of the Treasury, Alexander Hamilton. Filmed live on Broadway from the Richard Rodgers Theatre with the original Broadway cast.",
            images = listOf("https://www.imdb.com/title/tt8503618/mediaviewer/rm1749789441/",
                 "https://www.google.com/search?tbm=isch&q=hamilton&tbs=imgo:1#imgrc=E53GfPuzuUiWGM"
                ),
            "8.5"
        ),

        Movie(
            "tt10919380",
            "The Invisible Man",
            "2020",
            "Horror, Mystery, Sci-Fi",
            "Elisabeth Moss, Oliver Jackson-Cohen, Harriet Dyer",
            "When Cecilia's abusive ex takes his own life and leaves her his fortune, she suspects his death was a hoax. As a series of coincidences turn lethal, Cecilia works to prove that she is being hunted by someone nobody can see.",
            images = listOf("https://www.imdb.com/title/tt1051906/mediaviewer/rm1775417345/",
                "https://www.google.com/search?tbm=isch&q=The%20Invisible%20Man&tbs=imgo:1#imgrc=Z8SWCIKArDvedM"
            ),
            "7.1"
        ),

        Movie(
            "tt4566758",
            "Onward",
            "2020",
            "Animation, Adventure, Comedy",
            "Tom Holland, Chris Pratt, Julia Louis-Dreyfus",
            "Two elven brothers embark on a quest to bring their father back for one day.",
            images = listOf("https://www.imdb.com/title/tt7146812/mediaviewer/rm2806809345/",
                "https://www.google.com/search?q=Onward&tbm=isch&ved=2ahUKEwjj0_-dz87-AhWonCcCHRoECggQ2-cCegQIABAA&oq=Onward&gs_lcp=CgNpbWcQAzIHCAAQigUQQzIHCAAQigUQQzIHCAAQigUQQzIHCAAQigUQQzIHCAAQigUQQzIHCAAQigUQQzIHCAAQigUQQzIFCAAQgAQyBQgAEIAEMgUIABCABFCTEViTEWCaFWgAcAB4AIAB-gGIAe4DkgEDMi0ymAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=GM5MZOPnCKi5nsEPmoioQA#imgrc=zZOhZlllG2ov-M"),
            "7.4"
        ),

        Movie(
            "tt7286456",
            "Joker",
            "2020",
            "Crime, Drama, Thriller",
            "Joaquin Phoenix, Robert De Niro, Zazie Beetz",
            "In Gotham City, mentally troubled comedian Arthur Fleck is disregarded and mistreated by society. He then embarks on a downward spiral of revolution and bloody crime. This path brings him face-to-face with his alter-ego: the Joker.",
           images = listOf("https://www.imdb.com/title/tt7286456/mediaviewer/rm3353122305/",
           "https://www.google.com/search?tbm=isch&q=joker&tbs=imgo:1#imgrc=TKwYWSo7LgJRzM"),
            "8.4"
        ),

        Movie(
            "tt12361974",
            "The Trial of the Chicago 7",
            "2020",
            "Drama, History, Thriller",
            "Eddie Redmayne, Alex Sharp, Sacha Baron Cohen",
            "The story of 7 people on trial stemming from various charges surrounding the uprising at the 1968 Democratic National Convention in Chicago, Illinois.",
            images = listOf("https://www.imdb.com/title/tt1070874/mediaviewer/rm850502913/",
                "https://www.google.com/search?tbm=isch&q=The%20Trial%20of%20the%20Chicago%207&tbs=imgo:1#imgrc=CEpx_EXmcthPiM"
                ),
            "7.8"
        )

        )
}