package gpt.ac.util

import gpt.ac.check.Check
import gpt.ac.Main
import org.reflections.Reflections
import java.awt.SystemColor.info

object CheckManager {
    //I had to paste this from Bloatware as ChatGPT was too retarded
    val checkClasses = HashSet<Check>()

    fun init() {
        val reflections = Reflections("gpt.ac.check")
        val subTypes = reflections.getSubTypesOf(Check::class.java)

        val startTime = System.currentTimeMillis()
        subTypes.forEach {
            checkClasses.add(it.getDeclaredConstructor().newInstance())
            Main.log("Added ${it.simpleName} to Check List")
        }
        val finishTime = System.currentTimeMillis()

     Main.log("Finished Loading Checks in ${finishTime - startTime} ms")
    }

    fun getCheckByClass(checkClass: Check): Check? {
        return checkClasses.find { it::class == checkClass::class }
    }
}
