class Monster() {

    var monster_name: String = "Typhoon"
    def getMonsterName: String = monster_name * 2
}

@main def monsters() ={
    var mons = new Monster()
    println(mons.monster_name)
    println(mons.getMonsterName)
}