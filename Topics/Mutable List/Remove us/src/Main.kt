fun solution(elements: MutableList<String>, index: Int): MutableList<String> {
    elements.remove(elements.removeAt(index))
    return elements
}