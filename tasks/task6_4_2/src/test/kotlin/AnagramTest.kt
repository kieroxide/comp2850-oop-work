// Task 6.4.2

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class AnagramTest: StringSpec({
    "Check anagram of two empty strings "{
        withClue("Empty string is an anagram of Empty String") {"".anagramOf("") shouldBe true}
    }
    
    "Check anagram of two different size strings" {
        withClue("dog is not an anagram of dogdog") {"dog".anagramOf("dogdog") shouldBe false}
    }

    "Check anagram of same sized strings where they are not anagrams" {
        withClue("cart is not an anagram of dart") {"cart".anagramOf("dart") shouldBe false}
    }

    "Check anagram of same sized strings where they are anagrams" {
        withClue("cart is an anagram of ract") {"cart".anagramOf("ract") shouldBe true}
    }
})
