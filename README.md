# cblog
**This is still not production ready!**

![build status](https://secure.travis-ci.org/kremers/cblog.png?branch=master)

A blogging software written in clojure. 

Next todos:

* <del>Refactor sandbar "layout" function to moustache tempalte</del>
* <del>Datamodel for posts,...</del>
* <del>Simple functionality to add crud posts</del>
* <del>Defensive bootstrap of database with default categories, settings and users</del>
* <del>CRUD for categories</del>
* <del>Categories with URLfriendly name</del>
* <del>Routes to view categories and posts by /:category</del> and /:category/:post
* <del>AdminUI, Output and Selection for categories</del>
* <del>HideTitle Option for posts</del>
* <del>Settings section (configure blog name, admin password, ...)</del>
* <del>Enhance AdminUI with more ajax feeling & (Web-)design changes</del>
* <del>Fix broken build (heroku and 'local runnable' app - see core.clj)</del>
* <del>Fix broken links from adminui</del>
* <del>Change password functionality - settings page</del>
* <del>Automatic (client side) generation of URLfriendly name</del>
* <del>Print application health on admin welcome page.  Runtime/getRuntime ...</del>
* <del>Fix broken links "recent posts"</del>
* Fix "number does not work as password"
* S3 connection and binary data upload & Media Section
* Write the persistent user sessions to mongodb, currently existing frameworks do not work with monger and clojure 1.3. Fork and refactor them
* RSS and ATOM feed (RSS & Atom templates for mustache are available)
* Configurable Blogroll
* Tags & Tag Cloud
* Comments, Askimet Integration
* Move this page to a todo page and write instructions how to install this blog

Tech goal:

* Building reference projects for clojure
* High scalable
* No data stored on application servers
* Run it on Heroku & S3
* Optional caching with memcached
* Binary data in S3, other data in MongoDB (sessions, posts, ...)
* "Reference" building for a clojure web stacks

## Usage

git clone, ./run.sh

## License

Copyright (C) 2012 Martin Kremers

Distributed under the GPLv3, see http://www.gnu.org/licenses/gpl.html
