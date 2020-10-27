import React from 'react'
import { Header, Footer, Drawer } from '../../components'
import './mainPage.scss'

const drawerItems = ['Create story', 'Continue story', 'Search stories']

const MainPage = () => {
  return (
    <div id="main">
      <Drawer title="DND RELAY-WRITER" drawerItems={drawerItems} />
      <Footer
        content={
          'Repository for this project can be found at github.com/MelindaSW/relay-writer.'
        }
      />
    </div>
  )
}

export default MainPage