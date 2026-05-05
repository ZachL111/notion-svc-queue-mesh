fun main() {
    val signalcase_1 = Signal(78, 83, 13, 5, 8)
    check(Policy.score(signalcase_1) == 176)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(77, 95, 23, 6, 13)
    check(Policy.score(signalcase_2) == 154)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(106, 80, 16, 15, 8)
    check(Policy.score(signalcase_3) == 147)
    check(Policy.classify(signalcase_3) == "review")
}
