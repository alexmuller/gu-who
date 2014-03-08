package lib

import org.kohsuke.github.GHUser

object SponsorRequirement extends AccountRequirement {

  val sponsoredUserLogins = Set("lindseydew")

  override val issueLabel = "Sponsor"

  override val fixSummary =
    "Get a Pull-Request opened to add your username to our " +
      "[users.txt](https://github.com/guardian/people/blob/master/users.txt) file " +
      "_- ideally, a Guardian Tech Lead or Dev Manager should open this request for you_."

  override def isSatisfiedBy(user: GHUser): Boolean = sponsoredUserLogins.contains(user.getLogin)

}